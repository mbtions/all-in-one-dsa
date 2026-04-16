import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class L2_ADD_TWO_NUMBERS_Opt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("List l1:");
        ListNode l1 = new ListNode(0);
        ListNode tmp = l1;
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            tmp.next = new ListNode(sc.nextInt());
            tmp = tmp.next;
        }
        l1 = l1.next;

        System.out.println("\nList l2:");
        ListNode l2 = new ListNode(0);
        tmp = l2;
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            tmp.next = new ListNode(sc.nextInt());
            tmp = tmp.next;
        }
        l2 = l2.next;

        ListNode l3 = addTwoNumbers(l1, l2);

        System.out.println("\nList l3:");

        tmp = l3;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }

        sc.close();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            carry = sum / 10;
        }

        return l3.next;
    }
}