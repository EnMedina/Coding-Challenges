
/*
 * https://leetcode.com/problems/subdomain-visit-count/submissions/ 
 * Return the number of visitors per subdomain 
*/ @Author EnMedina

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> visits = new HashMap<>();
        for( String domain : cpdomains){
            String[] A = domain.split(" ");
            boolean remainingSubdomains = true;
            while( remainingSubdomains ){
                //System.out.println("Trying for " + A[1] + "Number is " + A[0]); 
                if(visits.keySet().contains(A[1])){
                    visits.put(A[1],visits.get(A[1])+Integer.parseInt(A[0]));
                }
                else{
                    visits.put(A[1],Integer.parseInt(A[0]));
                }
                //System.out.println("Current count : " + A[1] + visits.get(A[1]));
                int nextDotI = 0;
                remainingSubdomains = false;
                while(nextDotI < A[1].length()){
                    if(A[1].charAt(nextDotI) == '.'){
                        remainingSubdomains = true;
                        A[1] = A[1].substring(nextDotI+1);
                        break;
                    }
                    nextDotI++;
                }
            }
        }
        
        List<String> domainVisits = new LinkedList<>();
        for( String domain : visits.keySet() ){
            domainVisits.add("" + visits.get(domain) + " " + domain);
        }
        
       return domainVisits;
    }
}
