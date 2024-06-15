pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Run') {
            steps {
                bat 'java -cp "C:\\Users\\jangs\\git\\mission2\\homework\\target\\classes" homework.PerformanceTest'
            }
        }
    }
}
