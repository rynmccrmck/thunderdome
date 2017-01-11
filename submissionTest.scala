import scala.io.Source

//load files
val actuals = Source.fromFile("submission_actual.csv").getLines
val submission = Source.fromFile("submission.csv").getLines
val submissionMap = submission.map(_.split(", *")).map{arr => arr.init.mkString(", ") -> arr.last}.toMap


abstract class Evaluator(actualsFile:String, submissionFile:String) {

  def loadSubmissions2Map():Map[String,String] = {
    val submission = Source.fromFile(submissionFile).getLines
    submission.map(_.split(", *")).map{arr => arr.init.mkString(", ") -> arr.last}.toMap
  }

  def loadActuals():Iterator[String] = {
    Source.fromFile(actualsFile).getLines
  }

  def recordCreate(submission:Map[String,String], actuals:Iterator[String]):(Double,Double) = {
    val record = actuals.next.split(", *").lift
    val key = record(0).getOrElse("ERROR")
    val value = record(1).getOrElse(0).toString.toDouble
    val submittedValue = map.getOrElse(key,0).toString.toDouble
    (value,submittedValue)    
  }

  def recordError(prediction:Double, actual:Double):Double = {
    math.abs(prediction - actual)
  }

  def evaluate:Double
}

class totalAbsoluteError(actualsFile:String, submissionFile:String) extends Evaluator(actualsFile, submissionFile)  {
    def evaluateSubmission(submission:Map[String,String], 
                actuals:Iterator[String], acc:Double = 0):Double = {
        val (prediction, actual) = super.recordCreate(submission,actuals)
        val currError = super.recordError(prediction,actual)
        val runningTotal = acc + currError
        if(actuals.hasNext){
            evaluateSubmission(submission, actuals, runningTotal)
        }else{acc}
    }
    override def evaluate():Double = this.evaluateSubmission(super.loadSubmissions2Map(),super.loadActuals())
}

class meanAbsoluteError(actualsFile:String, submissionFile:String) extends Evaluator(actualsFile, submissionFile)  {
    def evaluateSubmission(submission:Map[String,String], 
                actuals:Iterator[String], acc:Double = 0, count:Int = 0):Double = {
        val (prediction, actual) = super.recordCreate(submission,actuals)
        val currError = super.recordError(prediction,actual)
        val runningTotal = acc + currError
        val n = count + 1
        if(actuals.hasNext){
            evaluateSubmission(submission, actuals, runningTotal,n)
        }else{acc/n}
    }
    override def evaluate():Double = this.evaluateSubmission(super.loadSubmissions2Map(),super.loadActuals())
}

class meanConsequentialError(actualsFile:String, submissionFile:String) extends Evaluator(actualsFile, submissionFile)  {
    def evaluateSubmission(submission:Map[String,String], 
                actuals:Iterator[String], acc:Double = 0, count:Int = 0):Double = {
        val (prediction, actual) = super.recordCreate(submission,actuals)
        val currError = if (prediction == actual) 0 else 1
        val runningTotal = acc + currError
        val n = count + 1
        if(actuals.hasNext){
            evaluateSubmission(submission, actuals, runningTotal,n)
        }else{acc/n}
    }
    override def evaluate():Double = this.evaluateSubmission(super.loadSubmissions2Map(),super.loadActuals())
}


class rootMeanSquaredError(actualsFile:String, submissionFile:String) extends Evaluator(actualsFile, submissionFile)  {

    def evaluateSubmission(submission:Map[String,String], 
                actuals:Iterator[String], acc:Double = 0, count:Int = 0):Double = {
        val (prediction, actual) = super.recordCreate(submission,actuals)
        val currError = math.pow((prediction - actual),2)
        val runningTotal = acc + currError
        val n = count + 1
        if(actuals.hasNext){
            evaluateSubmission(submission, actuals, runningTotal,n)
        }else{math.pow((acc/n), (1.0/2))}
    }
    override def evaluate():Double = this.evaluateSubmission(super.loadSubmissions2Map(),super.loadActuals())
}

class rootMeanSquaredLogarithmicError(actualsFile:String, submissionFile:String) extends Evaluator(actualsFile, submissionFile)  {

    def evaluateSubmission(submission:Map[String,String], 
                actuals:Iterator[String], acc:Double = 0, count:Int = 0):Double = {
        val (prediction, actual) = super.recordCreate(submission,actuals)
        val currError = math.pow((math.log(prediction) - math.log(actual)),2)
        val runningTotal = acc + currError
        val n = count + 1
        if(actuals.hasNext){
            evaluateSubmission(submission, actuals, runningTotal,n)
        }else{math.pow((acc/n), (1.0/2))}
    }
    override def evaluate():Double = this.evaluateSubmission(super.loadSubmissions2Map(),super.loadActuals())
}

 
val test = new rootMeanSquaredLogarithmicError("submission_actual.csv","submission.csv")
test.evaluate()
