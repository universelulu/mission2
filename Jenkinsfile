pipeline {
    agent any

    stages{
        stage('CheckOut')
        {
            steps{
                checkout scm
            }
        }
        stage('Build'){
            steps{
                bat 'mvn clean install'
                bat 'java -cp C:/Users/jangs/git/mission2/homework/target/homework-0.0.1-SNAPSHOT.jar homework.PerformanceTest > output.txt'
            }
        }
    }
}
