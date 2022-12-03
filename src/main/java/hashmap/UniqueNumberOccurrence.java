class UniqueNumberOccurrence {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mapper = new HashMap();
        for( int i : arr){
            mapper.put(i, mapper.getOrDefault(i, 0) + 1);
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
