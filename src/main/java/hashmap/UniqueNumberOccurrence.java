class UniqueNumberOccurrence {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mapper = new HashMap();
        mapper.put(arr[0], 1);
        for(int i=1;i<arr.length; i++)
        {
            if(mapper.containsKey(arr[i])){
                int count = mapper.get(arr[i]);
                mapper.put(arr[i] ,count+1);
            }
            else{
                mapper.put(arr[i], 1);
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i : mapper.keySet()){
            int value = mapper.get(i);
            if(set.contains(value))
                return false;
            else
                set.add(value);
        }
        return true;
    }
}
