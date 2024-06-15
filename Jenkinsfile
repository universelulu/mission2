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
                bat 'mvn clean install'
            }
        }
        stage('Run'){
            bat 'java -cp "target/classes" homework.PerformanceTest'
        }
    }
}

