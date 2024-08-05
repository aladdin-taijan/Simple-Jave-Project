node{
    git branch: 'main', url: 'https://github.com/aladdin-taijan/Simple-Jave-Project.git'
    stage('build'){
        try{
            sh'echo "build stage"'
        }
        catch(Exception e){
            sh'echo "We have an error"'
            throw e
        }
    }
    stage('test'){
        if (env.BRANCH_NAME == 'feat'){
            sh'echo "test stage"'
        }
        else{
            sh'echo "We have an error"'
        }
    }

}