/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* sortList(ListNode* h) {
        vector<int>a;
        ListNode*p=h;
        while(p!=NULL){
            a.push_back(p->val);
            p=p->next;
        }
        sort(a.begin(),a.end());
        p=h;
        int i=0;
        while(p!=NULL){
            p->val=a[i];
            p=p->next;
            i++;
        }
        return h;
    }
};