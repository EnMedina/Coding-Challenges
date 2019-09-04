/**
 *  https://leetcode.com/problems/groups-of-special-equivalent-strings/submissions/
 *  Return the number of groups that is created
 *  @Author EnMEdina
 **  /


class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> groups = new HashSet<>();
        for(String s : A){
            groups.add(createGroup(s));
        }
        return groups.size();
    }

    private String createGroup(String s){
        char[] chars = new char[s.length()];
        int arrIndex = 0;
        for(int i = 0 ; i < chars.length ; i+=2){
            chars[arrIndex++] = s.charAt(i);
        }
        for(int i = 1 ; i < chars.length ; i+=2){
            chars[arrIndex++] = s.charAt(i);
        }

        Arrays.sort(chars,0,(chars.length/2) );
        Arrays.sort(chars,(chars.length/2),chars.length);

        return String.valueOf(chars);
    }
}
