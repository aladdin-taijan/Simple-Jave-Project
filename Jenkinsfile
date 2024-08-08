pipeline{
    agent {
        label 'AWS-agent'
    }

    stages{
        stage('Build'){
            steps{
                script{
                    sh 'mvn clean package'
                    
                }
            }
        }
        
        stage('test'){
            steps{
                script{
                    echo "testing the application in progress"
                }

            }
        }

    }

    
}