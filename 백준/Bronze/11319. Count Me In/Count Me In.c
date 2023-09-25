#include<stdio.h>
#include<string.h>

int main() {

	int n, consonant, vowel;
	char arr[1001];

	scanf("%d", &n);
	
	for (int i = 0; i < n; i++) {
		
		gets(arr); // 키보드로 부터 문자열을 입력받는 함수
		scanf("%[^\n]s", arr); // 공백문자를 포함하지 않는 문자열
		
		consonant = 0;
		vowel = 0;
		for (int j = 0; j < strlen(arr); j++) {
			if (arr[j] == 'A') {
				vowel++;
			}
			else if (arr[j] == 'E') {
				vowel++;
			}
			else if (arr[j] == 'I') {
				vowel++;
			}
			else if (arr[j] == 'O') {
				vowel++;
			}
			else if (arr[j] == 'U') {
				vowel++;
			}
			else if (arr[j] == 'a') {
				vowel++;
			}
			else if (arr[j] == 'e') {
				vowel++;
			}
			else if (arr[j] == 'i') {
				vowel++;
			}
			else if (arr[j] == 'o') {
				vowel++;
			}
			else if (arr[j] == 'u') {
				vowel++;
			}
			else if (arr[j] == ' ') {

			}
			else {
				consonant++;
			}
		}
		printf("%d %d\n", consonant, vowel);
	}

	return 0;
}