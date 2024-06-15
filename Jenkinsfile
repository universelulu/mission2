pipeline {
    agent any

    tools {
        jdk 'JDK17' // Jenkins에서 설정한 JDK 이름을 지정합니다.
        maven 'maven-3.9.7' // Maven을 사용할 경우 Maven도 함께 지정합니다.
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
                echo 'Hello World'
            }
        }
    }
}
