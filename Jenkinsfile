pipeline {
    agent any

    stages{
        stage('Checkout'){
            steps{
                // 소스코드 체크아웃
                checkout scm
            }
        }
        stage('Compile'){
            steps{
                sh 'mvn clean compile'
            }
        }
    }
}
