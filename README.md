# NumbersToWords
This is springboot Test driven development approach for NumberToWords with configurable limit of digits



#Step 1: download zip file from git hum

#Step 2: unzip it any location (ex: C:\Users\PC\Downloads\BelgiumTest-master\BelgiumTest-master\numtoword>)

 #step 3: run below command in the same unzipped location mvn clean install step 4: run executable jar using below command

java -jar target/numtoword-0.0.1-SNAPSHOT.jar "100000"

Verify the output in console.

#Repeat the step 4 multiple test.






package wise Test results Total : 77% (Once you run please refer jaco report under C:\Users\PC\Documents\GitHub\NumbersToWords\target\site\jacoco\index.html)


numtoword
Element	Missed Instructions	Cov.	Missed Branches	Cov.	Missed	Cxty	Missed	Lines	Missed	Methods	Missed	Classes
Total	48 of 396	87%	5 of 22	77%	6	29	9	61	2	18	1	4
com.belgium.numtoword	2311	32%	31	25%	3	5	4	8	1	3	0	1
com.belgium.numtoword.business.strategy	21331	94%	216	88%	2	21	3	49	0	12	0	1
com.belgium.numtoword.business.exception	4	0%		n/a	1	1	2	2	1	1	1	1
com.belgium.numtoword.business.impl	6	100%		n/a	0	2	0	2	0	2	0	1