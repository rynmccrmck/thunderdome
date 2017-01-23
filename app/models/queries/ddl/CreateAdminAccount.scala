package models.queries.ddl

import services.user.AuthenticationEnvironment;
import jdub.async.Statement
import com.mohiva.play.silhouette.impl.util.{ BCryptPasswordHasher, DefaultFingerprintGenerator, SecureRandomIDGenerator }
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import java.util.UUID;

case object CreateAdminAccount extends Statement {
  
    val cnf = play.api.Play.current.configuration
    val adminUser = cnf.getString("admin.user").getOrElse("admin")
    val adminPass = cnf.getString("admin.password").getOrElse("changeme123")
    val adminEmail = cnf.getString("admin.email").getOrElse("admin@localhost.com")
    val hasher = new BCryptPasswordHasher()
    val passwordHash = hasher.hash(adminPass).password
    //val uuidGen = new SecureRandomIDGenerator().generate.value fix this
    val uuidGen =  UUID.randomUUID();
    
  override val sql = s"""
    INSERT INTO user_profiles(provider, key, email, avatar_url,created) 
    values ('credentials','${adminEmail}','${adminEmail}','default',current_timestamp);
    
    INSERT INTO users(id,username,profiles,roles,created) 
    values ('${uuidGen}','${adminUser}','{credentials:${adminEmail}}','{user,admin}',current_timestamp);
    
    INSERT INTO password_info(provider,key,hasher,password,created) 
    values ('credentials','${adminEmail}','bcrypt','${passwordHash}',current_timestamp);
  """
}