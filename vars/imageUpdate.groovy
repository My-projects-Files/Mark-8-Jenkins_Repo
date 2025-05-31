def call () {
	sh '''
	 ls -l
	 git clone ${GIT_DEST_REPO}
	 cd ${GIT_REPO_NAME}
	 git config user.email "kamaleshsai33@gmail.com"
	 git config user.name "saikamal33"
	 BUILD_NUMBER=${BUILD_NUMBER}
	 sed -i "s|image: .*$|image: ${DOCKER_IMAGE}|" ${GIT_DEST_DEPLOYMENT}
	 git add ${GIT_DEST_DEPLOYMENT
         git commit -m "Update deployment image to version ${BUILD_NUMBER}"
	 git push https://${GITHUB_TOKEN}@github.com/${GIT_USER_NAME}/${GIT_REPO_NAME} HEAD:main
	'''
}

