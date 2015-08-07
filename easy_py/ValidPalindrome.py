import re

class Solution:
    # @param {string} s
    # @return {boolean}
    
    def isPalindrome(self, s):
        letters = map(lambda x: x.lower(), re.findall('[a-zA-Z0-9]', s))
        
        count = len(letters)
        if count <= 1:
            return True
            
        i = 0
        j = count-1
        while i < j:
            if letters[i] != letters[j]:
                return False
            i += 1
            j -= 1
            
        return True
