public class linked_list {
    private node head;
    public class node
    {
        int data;
        node next;
        node(int val)
        {
            this.data=val;
            this.next=null;
        }
    }
    linked_list()
    {
        head =null;
    }
    public void insertatbeg(int val)
    {
        node newnode = new node(val);
        if(head==null)
        {
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertatend(int val)
    {
        node newnode =new node(val);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node temp =head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void insertatposition(int position,int val)
    {
        if(position==1)
        {
            insertatbeg(val);
        }
        node newnode =new node(val);
        
        node temp=head;
        node previous=null;
        int i;
        for(i=1;i<position;i++)
        {
            previous=temp;
            temp=temp.next;
        }
        previous.next=newnode;
        newnode.next=temp;
    }
    public void disply()
    {
        if(head==null)
        {
            throw new ArrayIndexOutOfBoundsException();

        }
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }


}

