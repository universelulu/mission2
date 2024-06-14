pipeline {
    agent any

    

    stages{
        stage('Checkout'){
            steps{
                // 소스코드 체크아웃
                checkout scm
            }
        }
        stage('Build'){
            steps{
                bat 'mvn clean package'
            }
        }
    }

    post {
        success {
          java -jar C:/Users/jangs/git/mission2/homework/target/homework-0.0.1-SNAPSHOT.jar
       }
   }
}

