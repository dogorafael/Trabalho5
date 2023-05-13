pipeline {
    agent any

    tools {        
        maven "M3"        
        jdk "JDK 15"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/dogorafael/Trabalho5'

                // Run Maven on a Unix agent.
                sh "cd Trabalho4; mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/Trabalho4/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'Trabalho4/target/*.jar'
                }
            }
        }
    }
}