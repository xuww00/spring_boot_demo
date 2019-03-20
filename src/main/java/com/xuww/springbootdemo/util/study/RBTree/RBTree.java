package com.xuww.springbootdemo.util.study.RBTree;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 9:26 2019/3/13.
 * @Modifide BY
 * @Version: 1.0
 */
public class RBTree<T extends Comparable<T>> {
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    private RBNode<T> mRoot; //根结点

    public class RBNode<T extends Comparable<T>>{
        boolean color; //颜色
        T key; //关键字（键值）
        RBNode<T> left;//左孩子
        RBNode<T> right;//右孩子
        RBNode<T> parent;//父结点

        public RBNode(boolean color, T key, RBNode<T> left, RBNode<T> righ, RBNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = righ;
            this.parent = parent;
        }
    }

    /**
     * 对红黑树的节点(x)进行左旋转
     *
     * 左旋示意图(对节点x进行左旋)：
     *      px                              px
     *     /                               /
     *    x                               y
     *   /  \      --(左旋)-.           / \                #
     *  lx   y                          x  ry
     *     /   \                       /  \
     *    ly   ry                     lx  ly
     */
    private void leftRotate(RBNode<T> x){
        //设置x的右孩子为y
        RBNode<T> y = x.right;

        //将"y的左孩子"设为"x的右孩子"
        //如果y的左孩子非空，将"x"设为"y的左孩子的父亲"
        x.right = y.left;
        if (y.left != null){
            y.left.parent = x;
        }

        //将x的父亲设为y的父亲
        y.parent = x.parent;
        if (x.parent == null){
            this.mRoot = y;  //x的父亲结点是空结点，则将y设为根结点
        }else {
            if (x.parent.left == x)
                x.parent.left = y; //如果x是他父节点的左孩子，则将y设为x的父结点的左孩子
            else
                x.parent.right = y;//如果x是他父节点的右孩子，则将y设为x的父结点的右孩子
        }
        //将x设为y的左孩子
        y.left = x;
        //将x的父节点设为y
        x.parent = y;
    }
    /**
     * 对红黑树的节点(y)进行右旋转
     *
     * 右旋示意图(对节点y进行左旋)：
     *            py                               py
     *           /                                /
     *          y                                x
     *         /  \      --(右旋)-.            /  \                     #
     *        x   ry                           lx   y
     *       / \                                   / \                   #
     *      lx  rx                                rx  ry
     *
     */
    private void rightRotate(RBNode<T> y){
        // 设置x是当前节点的左孩子。
        RBNode<T> x = y.left;

        // 将 “x的右孩子” 设为 “y的左孩子”；
        // 如果"x的右孩子"不为空的话，将 “y” 设为 “x的右孩子的父亲”
        y.left = x.right;
        if (x.right != null)
            x.right.parent = y;

        // 将 “y的父亲” 设为 “x的父亲”
        x.parent = y.parent;

        if (y.parent == null) {
            this.mRoot = x;            // 如果 “y的父亲” 是空节点，则将x设为根节点
        } else {
            if (y == y.parent.right)
                y.parent.right = x;    // 如果 y是它父节点的右孩子，则将x设为“y的父节点的右孩子”
            else
                y.parent.left = x;    // (y是它父节点的左孩子) 将x设为“x的父节点的左孩子”
        }

        // 将 “y” 设为 “x的右孩子”
        x.right = y;

        // 将 “y的父节点” 设为 “x”
        y.parent = x;
    }
    /**
     *将一个节点插入到红黑树中，需要执行哪些步骤呢？首先，将红黑树当作一颗二叉查找树，将节点插入；然后，将节点着色为红色；最后，通过"旋转和重新着色"等一系列操作来修正该树，使之重新成为一颗红黑树。详细描述如下：
     第一步: 将红黑树当作一颗二叉查找树，将节点插入。
     红黑树本身就是一颗二叉查找树，将节点插入后，该树仍然是一颗二叉查找树。也就意味着，树的键值仍然是有序的。此外，无论是左旋还是右旋，若旋转之前这棵树是二叉查找树，旋转之后它一定还是二叉查找树。这也就意味着，任何的旋转和重新着色操作，都不会改变它仍然是一颗二叉查找树的事实。
     好吧？那接下来，我们就来想方设法的旋转以及重新着色，使这颗树重新成为红黑树！

     第二步：将插入的节点着色为"红色"。
     为什么着色成红色，而不是黑色呢？为什么呢？在回答之前，我们需要重新温习一下红黑树的特性：
     (1) 每个节点或者是黑色，或者是红色。
     (2) 根节点是黑色。
     (3) 每个叶子节点是黑色。 [注意：这里叶子节点，是指为空的叶子节点！]
     (4) 如果一个节点是红色的，则它的子节点必须是黑色的。
     (5) 从一个节点到该节点的子孙节点的所有路径上包含相同数目的黑节点。
     将插入的节点着色为红色，不会违背"特性(5)"！少违背一条特性，就意味着我们需要处理的情况越少。接下来，就要努力的让这棵树满足其它性质即可；满足了的话，它就又是一颗红黑树了。o(∩∩)o...哈哈

     第三步: 通过一系列的旋转或着色等操作，使之重新成为一颗红黑树。
     第二步中，将插入节点着色为"红色"之后，不会违背"特性(5)"。那它到底会违背哪些特性呢？
     对于"特性(1)"，显然不会违背了。因为我们已经将它涂成红色了。
     对于"特性(2)"，显然也不会违背。在第一步中，我们是将红黑树当作二叉查找树，然后执行的插入操作。而根据二叉查找数的特点，插入操作不会改变根节点。所以，根节点仍然是黑色。
     对于"特性(3)"，显然不会违背了。这里的叶子节点是指的空叶子节点，插入非空节点并不会对它们造成影响。
     对于"特性(4)"，是有可能违背的！
     那接下来，想办法使之"满足特性(4)"，就可以将树重新构造成红黑树了。
     */
    private void insert(RBNode<T> node) {
        int cmp;
        RBNode<T> y = null;
        RBNode<T> x = this.mRoot;
        //1.将红黑树当做一颗二叉查找树，将结点添加到二叉查找树中
        while (x != null){
            y = x;
            cmp = node.key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else
                x = x.right;
        }
        node.parent = y;
        if (y != null){
            cmp = node.key.compareTo(y.key);
            if (cmp < 0)
                y.left = node;
            else
                y.right = node;
        }else {
            this.mRoot = node;
        }
        //2.设置结点为红色
        node.color = RED;
        //3.将它重新修正为一颗二叉查找树
        insertFixUp(node);
    }

    /**
     * @Description: 新建结点（key），并将其插入到红黑树中
     * @Parm:
     * @Date: Created 10:36 2019/3/13
     */
    public void insert (T key){
        RBNode<T> node = new RBNode<T>(BLACK, key, null, null, null);
        if (node != null)
            insert(node);
    }

    /**
     *红黑树插入修正函数
     * 在向红黑树中插入节点之后(失去平衡)，再调用该函数；
     * 目的是将它重新塑造成一颗红黑树。
     * @param node
     */
    private void insertFixUp(RBNode<T> node) {
        RBNode<T> parent, gParent;

        //若父节点存在，并且父节点的颜色是红色
        while (((parent = parentOf(node)) != null) && isRed(parent)){
            gParent = parentOf(parent);
            //若父节点是祖父节点的左孩子
            if (parent == gParent.left){
                //case1 叔叔结点是红色
                RBNode <T> uncle = gParent.right;
                if ((uncle != null) && isRed(uncle)){
                    setBlack(uncle);
                    setBlack(parent);
                    setRed(gParent);
                    node = gParent;
                    continue;
                }
                //case2 条件 叔叔是黑色，且当前结点是右孩子
                if (parent.right == node){

                }
            }
        }
    }

    public RBTree() {
        mRoot = null;
    }

    private RBNode<T> parentOf(RBNode<T> node){
        return node != null ? node.parent : null;
    }

    private boolean colorOf(RBNode<T> node){
        return node !=null ? node.color : BLACK;
    }

    private boolean isRed(RBNode<T> node){
        return ((node != null) && (node.color == RED)) ? true : false;
    }

    private boolean isBlack(RBNode<T> node){
        return !isRed(node);
    }

    private void setBlack(RBNode<T> node) {
        if (node != null) {
            node.color = BLACK;
        }
    }

    private void setRed(RBNode<T> node){
        if (node != null){
            node.color = RED;
        }
    }

    private void setParent(RBNode<T> node, RBNode<T> parent){
        if (node != null){
            node.parent = parent;
        }
    }

    private void setColor(RBNode<T> node, boolean color){
        if (node != null){
            node.color = color;
        }
    }
}
