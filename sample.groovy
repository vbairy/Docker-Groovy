BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Input (Please enter numbers with spaces):"
def userInput = br.readLine()
println "You entered: $userInput"
def values = userInput.split(' ');
print "Search String:"
def searchValue=br.readLine();
if(values.contains(searchValue) == true)
println "Your value found"
else
println: "Entered value Not Found in array"
def sortedData=values.sort();
println "Sorted List $sortedData"



 
    