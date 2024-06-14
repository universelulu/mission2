pipeline {
    agent any

    stages{
        stage('Checkout'){
            steps{
                git 'https://github.com/universelulu/mission2.git'
            }
        }
        stage('Compile'){
            steps{
                sh 'mvn clean compile'
            }
        }
    }
}
