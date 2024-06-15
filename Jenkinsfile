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
                bat 'javac -encodin utf-8 -d bin homework/src/homework/*.java'
            }
        }
    }
}
