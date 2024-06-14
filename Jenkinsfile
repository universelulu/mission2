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
        stage('Test'){
            java -cp C:/Users/jangs/git/mission2/homework/target/classes/homework PerformanceTest
        }
    }
}

