pipeline {
    agent any

    tools {
        // Jenkins에서 설정한 Maven Tool의 이름을 사용
        maven 'maven-3.9.7'
    }

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
                bat 'java -cp C:\Users\jangs\git\mission2\homework\target\homework-0.0.1-SNAPSHOT.jar homework.PerformanceTest > output.txt'
            }
        }
    }
}
