pipeline {
    agent any

    environment {
        MAVEN_HOME = 'C:/Users/jangs/apache-maven-3.9.7' name: 'Maven', type: 'maven'
        JUNIT_PLATFORM_JAR = 'junit-platform-console-standalone-1.7.1.jar'
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout([$class: 'GitSCM', 
                          branches: [[name: 'master']], 
                          userRemoteConfigs: [[credentialsId: 'Search_Book', 
                                                url: 'https://github.com/universelulu/mission2.git']]])
            }
        }

        stage('Build') {
            steps {
                configFileProvider([configFile(fileId: 'e8609132-e3e2-4ad1-9603-ffc5ce75f3cb', variable: 'MAVEN_SETTINGS')]) {
                    timeout(time: 20, unit: 'MINUTES') {
                        bat "\"${MAVEN_HOME}\\bin\\mvn\" clean install --settings \"${MAVEN_SETTINGS}\""
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // JUnit 5 테스트 실행을 위한 classpath 설정
                    def classpath = "classes;lib;${env.JUNIT_PLATFORM_JAR}"
                    // JUnit 5 테스트 실행
                    bat "java -cp ${classpath} org.junit.platform.console.ConsoleLauncher --scan-classpath > test_results.txt"
                }
            }
            post {
                always {
                    // 테스트 결과 파일을 저장하기 위해 아카이브
                    archiveArtifacts 'test_results.txt'
                }
                failure {
                    echo 'Build or test failed'
                }
                success {
                    echo 'Build and test succeeded'
                }
            }
        }
    }

    post {
        always {
            cleanWs() // Workspace 정리
        }
    }
}
