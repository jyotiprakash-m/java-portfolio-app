pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                git "https://github.com/jyotiprakash-m/java-portfolio-app.git"
            }
        }
        stage("compile"){
            steps{
            bat "mvn clean compile"
            }
        }
        
         stage("package"){
            steps{
            bat "mvn package"
            }
        }
        
        stage("docker_build"){
            steps{
            bat "docker build -t jyotiprakash002/java-portfolio-app:$BUILD_NUMBER ."
            }
        }
      
    }
   
}