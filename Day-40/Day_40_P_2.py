'''

Reena has to sent the mails regularly.
She used emphasize any word W based on a given set of words[].
Two emphasize the words she used enclose them with <i> and </i> tag.
The emphasize procedure of the sub-words of W is as follows:
	
	- If two sub-words are intersected with each other, 
	  enclose them with one <i></i> tag.
	
	- If two sub-words are enclosed with <i></i> tag and neighbours also,
	  then merge the sub-words as one and enclose with one <i> </i> tag.

You will be given the word W, and set of words[] to emphasize.
Your task is to help Reena to emphasize the word W.
and print it.

Input Format:
-------------
Line-1: A string W, the word.
Line-2: space separated strings, set of words[].

Output Format:
--------------
Print the string, the emphasized string.

Sample Input-1:
---------------
kmitngit123
it 123

Sample Output-1:
----------------
km<i>it</i>ng<i>it123</i>


Sample Input-2:
---------------
qwertykeypad
qwerty key pad

Sample Output-2:
----------------
<i>qwertykeypad</i>


'''

def addHtmlTag( s, dict):
    lookup = [0] * len(s)
    for d in dict:
        pos = s.find(d)
        while pos != -1:
            lookup[pos:pos+len(d)] = [1] * len(d)
            pos = s.find(d, pos + 1)

    result = []
    for i in range(len(s)):
        if lookup[i] and (i == 0 or not lookup[i-1]):
            result.append("<i>")
        result.append(s[i])
        if lookup[i] and (i == len(s)-1 or not lookup[i+1]):
            result.append("</i>")
    return "".join(result)
s=input()
dict=list(map(str,input().split()))
print(addHtmlTag( s, dict))