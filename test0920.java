class node{
    private String data;
    public node link;

    public String node(String data){
        
    }

    public String getData(){
        return this.data;
    }

    public void setData(){
        this.data = data;
    }
}

class linkedList {

    private node head;
    
    public boolean insertNode(String data){
        if (head == null) {
            head = new node(data);
            return true;
        } else{
            node preNode = head;
            node tempNode = head.link;
            while(preNode.link == null){
                if(data.equals(tempNode.getData())){
                    node newNode = new node(data);
                    preNode.link = newNode;
                    newNode.link =tempNode;
                    return true;
                }else{
                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }

    public boolean deleteNode(String data){
        if(head == null) return true;
        node preNode = head;
        node tempNode = head.link;
        else{

        } (data.equals(tempNode.getData)){
            
        }
    }



}