package practice;

class ListNode{
    private String data;    // ������ ���� ����
    public ListNode link;    // �ٸ� ��带 ������ ��ũ ���
    
    public ListNode() {
        this.data = null;
        this.link = null;
    }
    
    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }
    
    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }
    
    public String getData() {
        return this.data;
    }
}

public class LinkedList {
	private ListNode head;    // ListNode Ÿ���� head ��� �ν��Ͻ� ����
    
    // LinkedList ������
    public LinkedList() {
        head = null;    // head ��� �ʱ�ȭ
    }
    
    // Node ���� (�߰��� ����)
    public void insertNode(ListNode preNode, String data) {       
        ListNode newNode = new ListNode(data);    // ���ο� ��� ����
        
        // preNode.link�� preNode�� ���� ����̹Ƿ�,
        // newNode.link = preNode.link�� ���ο� ����� link�� preNode�� ���� ��带 �����ϵ��� ��. 
        newNode.link = preNode.link;
        
        // preNode�� link�� ���ο� ��带 �����ϵ��� ��.
        // ���������� 'preNode -> newNode -> ���� preNode�� ���� ��� '�̷��� ������.
        preNode.link = newNode;
    }
    
    // Node ���� (�������� ����)
    public void insertNode(String data) {
        ListNode newNode = new ListNode(data);    // ���ο� ��� ����
        if(head == null) {
            // head ��尡 null�� ��� ���ο� ��带 �����ϵ��� ��
            this.head = newNode;
        } else {
            // head ��尡 null�� �ƴ� ��� temp ��尡 head�� ����.
            // tempNode�� ������ ��带 ã�Ƽ� �����ϱ� ���� ���.
            ListNode tempNode = head;
            
            // temp ����� link�� null�� �ƴ� ������ ���� ��带 ����.
            // tempNode.link�� ���� ��带 �����ϰ� �����Ƿ�,
            // tempNode = tempNode.link�� tempNode�� ���� ��带 �����ϵ��� �ϴ� ��.
            // while���� ��� ����Ǹ� tempNode�� ���� ������ ��带 �����ϰ� ��.
            while(tempNode.link != null) {
                tempNode = tempNode.link;    // ���� ��带 ����
            }
            
            // tempNode(������ ���)�� link�� ���� ��带 �����ϵ��� ��. 
            tempNode.link = newNode;
        }
    }
    
    // Node ����(�߰� ��� ����)
    public void deleteNode(String data) {
        // preNode�� head�� ����Ű�� ��带 �Ҵ�
        ListNode preNode = head;
        // tempNode�� head�� ����Ű�� ����� ���� ���. ��, preNode�� ���� ��带 �Ҵ�
        ListNode tempNode = head.link; 
        
        // �־��� �����Ͱ� preNode�� �����Ϳ� ��ġ�ϴ� ���
        // ��, ù��° ����� �����Ϳ� ��ġ�ϴ� ���
        if(data.equals( preNode.getData() )) {
            // head�� preNode�� ���� ��带 �����ϵ��� ��.
            head = preNode.link;
            // preNode�� link�� null�� �Ҵ��Ͽ� ������ ����.
            preNode.link = null;
        } else {
            // tempNode�� null�� ������ �ݺ��Ͽ� Ž��
            while(tempNode != null) {
                // �־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ���.
                if(data.equals( tempNode.getData() )) {
                    // tempNode�� ������ ����� ���
                    if(tempNode.link == null) {
                        preNode.link = null;
                    } else {
                        // tempNode�� ������ ��尡 �ƴ� ���
                        // preNode�� link�� tempNode�� ���� ��带 ����.
                        // tempNode�� link�� null�� �Ҵ��Ͽ� ���� ������ ������ ����.
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                } else {
                    // �����Ͱ� ��ġ���� ���� ��� 
                    // preNode�� tempNode�� �Ҵ��ϰ�, tempNode�� ���� ��� �Ҵ�.
                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }
    
    // Node ����(������ ��� ����)
    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;
        
        // head ��尡 null�� ��� ��� ��尡 �����Ǿ����Ƿ� return
        if(head == null) {
            return;
        }
        
        // head ����� link�� null�� ���
        // ��尡 1�� ������ ���
        if(head.link == null) {
            // head�� null�� �Ҵ��Ͽ� ���� ������ ������ ����.
            head = null;
        } else {
            // preNode�� head�� ����Ű�� ��带 �Ҵ�
            preNode = head;
            // tempNode�� head�� ����Ű�� ����� ���� ���. ��, preNode�� ���� ��带 �Ҵ�
            tempNode = head.link;     
            
            // tempNode�� link�� null�� �ƴ� ������ �� ��徿 ���� ���� �̵�.
            // preNode�� tempNode�� �Ҵ��ϰ�
            // tempNode�� tempNode�� ���� ��带 �Ҵ�.
            // �̷��� �ϸ� preNode�� ������ ����� ���� ��尡 �ǰ�, tempNode�� ������ ��尡 ��.
            while(tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            
            // preNode�� link�� null�� ���� ���� ������ ��带 ����
            // ��, preNode�� ���� ����� tempNode���� ������ ����.
            preNode.link = null;
        }
    }
    
    // Node Ž��
    public ListNode searchNode(String data) {
        ListNode tempNode = this.head;    // temp ��忡 head�� ����Ű�� ù ��° �Ҵ�.
        
        // temp ��尡 null�� �ƴ� ������ �ݺ��Ͽ� Ž��
        while(tempNode != null) {
            // �־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ��� �ش� temp ��带 return
            if(data.equals(tempNode.getData())) {
                return tempNode;
            } else {
                // �����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�.
                tempNode = tempNode.link;
            }
        }
        
        return tempNode;
    }
    
    // ����Ʈ�� ��带 �������� ����
    public void reverseList() {
        ListNode nextNode = head;    // head�� �����ϴ� ù��° ��带 �Ҵ�.
        ListNode currentNode = null;
        ListNode preNode = null;
        
        // nextNode�� ���������� �̵��ϸ� currentNode�� link�� preNode�� �����ϵ��� ��.
        // 1) preNode�� currentNode ��ġ�� �̵�
        // 2) currentNode�� nextNode ��ġ�� �̵�
        // 3) nextNode�� ���� ��� ��ġ�� �̵�
        // 4) currentNode�� link�� preNode�� �����ϵ��� ��
        while(nextNode != null) {
            preNode = currentNode;    // preNode�� currentNode ��ġ�� �̵�
            currentNode = nextNode;    // currentNode�� nextNode ��ġ�� �̵�
            nextNode = nextNode.link;    // nextNode�� ���� ��� ��ġ�� �̵�
            currentNode.link = preNode;    // currentNode�� link�� preNode�� �Ҵ��Ͽ� �������� ����
        }
        
        head = currentNode;    // currentNode�� ������ ��带 ����ų ��, head�� currentNode�� �����ϵ��� ��.
    }
    
    // ���� ����Ʈ�� ����� ��� �����͸� ���
    public void printList() {
        ListNode tempNode = this.head;    // tempNode�� head�� ����Ű�� ù��° ��带 �Ҵ�
        
        // tempNode�� null�� �ƴ� ������ �ݺ��Ͽ� ���
        while(tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.link;    // temp ��忡 ���� ���(tempNode.link) �Ҵ�.
        }
        System.out.println();
    }
}
