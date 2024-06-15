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
                bat 'javac -cp C:/Users/jangs/eclipse/jee-2024-03/eclipse/plugins/junit-platform-console-standalone-1.7.1.jar'
                bat 'javac -encoding utf-8 -d bin homework/src/homework/*.java'
            }
        }
    }
}
