影片出租店小程序
    计算每一位顾客的消费金额并打印详单。
    输入：顾客租了哪些影片、租期多长，程序便根据租赁时间和影片类型算出费用。
    影片类型：普通片、儿童片和新片。
    常客计算积分，积分会根据租片种类是否为新片而不同。

费用计算过程：
    普通片：前两天，2$,以后每增加一天，增加1.5$
    新片： 每天3$
    儿童片：前三天，1.5$，以后每增加一天，增加1.5$

积分计算过程：
    租赁一部影片，增加积分1分
    新片且租期大于1天，额外增加积分1分

输出格式：（以Squirrel为例）
    Rental Record for Squirrel
       战狼II   15.0
    Amount owed is 15.0
    You earned 2 frequent renter points


v0.1 first version:
对象设计
Movie类:
    String title: 影片名称
    int priceCode: 影片类型
    影片类型常量:
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 1;
    public static final int NEW_RELEASE = 2;
Rental类:
   Movie movie: 影片
   int daysRented: 租期
Customer:
    String name: 顾客姓名
    ArrayList<Rental> rentals: 顾客租赁影片列表
    String statement(): 生成(输出)顾客详单

问题:
    statement()方法,过于复杂,做了很多应该由其它类完成的事情
    无法重用已有代码,在扩展、维护时,不得不很多重复相同的代码,导致后续修改时，需要确保代码的一致性。
    随着各种规则变得愈来愈复杂，适当的修改点愈来愈难找，不犯错的机会也愈来愈少。


