class Solution {
public:
    int myAtoi(string s) {
        int i = 0, c = 0;
        long long n = 0;
        while (i < s.size() && s[i] == ' ') {
            i++;
        }
        if (i == s.size()) {
            return 0;
        }
        if (s[i] == '-') {
            c = -1;
            i++;
        } else if (s[i] == '+') {
            c = 1;
            i++;
        } else {
            c = 1;
        }
        while (i < s.size() && s[i] == '0') {
            i++;
        }
        while (i < s.size() && isdigit(s[i])) {
            n = n * 10 + (s[i] - '0');
            if (n*c >= INT_MAX) {
                return INT_MAX;
            }
            if (n*c <= INT_MIN) {
            return INT_MIN;
        }
            i++;
        }
        n = n * c;
        return n;
    }
};