pipeline {
    agent any

    tools {
        maven 'maven-3.9.7'
    }

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
}
