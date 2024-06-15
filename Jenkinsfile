pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'maven-3.9.7'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
                echo 'Hello World'
            }
        }
    }
}
