class RecentCounter {
    queue <int> que;
public:
    int ping(int t) {
        que.push(t);
        while (que.front() + 3000 < t) {
            que.pop();
        }
        return que.size();
    }
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */