import scala.io.Source



object Evaluation{


  //load files
 // val actuals = Source.fromFile("submission_actual.csv").getLines
  //val submission = Source.fromFile("submission.csv").getLines
  //val submissionMap = submission.map(_.split(", *")).map{arr => arr.init.mkString(", ") -> arr.last}.toMap


  def loadSubmissions2Map(submissionFilePath:String):Map[String,String] = {
    val submissionFile = Source.fromFile(submissionFilePath)
    val submissions = submissionFile.getLines
    submissionFile.close()
    submissions.map(_.split(", *")).map{arr => arr.init.mkString(", ") -> arr.last}.toMap
  }

  def loadActuals(actualsFilePath:String):Iterator[String] = {
    val actualFile = Source.fromFile(actualsFilePath)
    val actuals = actualFile.getLines
    actualFile.close()
    actuals
  }


    trait validator{
        def name():String
        type T <: Any
        def predictionError(a:T,b:T):Double  
        def score(submission:Map[String,String], actuals:Iterator[String],acc:Double):Double 
        def recordJoin(submission:Map[String,String], actuals:Iterator[String]):(Double,Double) = {
            val record = actuals.next.split(", *").lift
            val key = record(0).getOrElse("ERROR")
            val value = record(1).getOrElse(0).toString.toDouble
            val submittedValue = submission.getOrElse(key,0).toString.toDouble
            (value,submittedValue)    
        }    
    }
    
    class RootMeanSquareError extends validator {
        
        override def name = "RMSE"
        
        type T = Double
        
        def predictionError(prediction:Double,actual:Double) = {
            math.pow((prediction - actual),2)
        }
        
        def score(submission:Map[String,String], 
            actuals:Iterator[String], acc:Double = 0):Double={
            val (prediction, actual) = recordJoin(submission,actuals)
            val currError = predictionError(prediction,actual)
            val runningTotal = acc + currError
            if(actuals.hasNext){
                score(submission, actuals, runningTotal)
            }else{acc}
        }
    }
    
    
}