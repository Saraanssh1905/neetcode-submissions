class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> orderMap = new HashMap<>();

        for(int n:nums){
            orderMap.put(n,orderMap.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a,b)->orderMap.get(a)-orderMap.get(b));

        for(int i: orderMap.keySet()){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int answer[] = new int [k];
        for(int i=0;i<answer.length;i++){
            answer[i]=heap.poll();
        }

        return answer;
    }
}
