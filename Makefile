
hooks-pre-push:
	mkdir "hooks" && cd hooks && touch pre-push && chmod +x pre-push
	cd .git/hooks && cp pre-push.sample pre-push
	cd .git/hooks && ln -s -f ../../hooks/pre-push pre-push

checkstyle-build:
	./gradlew build
checkstyle-test:
	./gradlew test

