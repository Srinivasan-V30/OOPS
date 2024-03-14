from Time import Time
class Main:
    flag=1
    while flag:
        hour,minute,second=map(int,input("Enter time in this format(HH:MM:SS): (24-Hour Based) ").split(":"))
        if (hour>23 or minute>59 or second>59):
            print("Invalid Time. Please try again!!!!!1")
            continue
        flag=0
    time1=Time(hour,minute,second)
    print("Current Time: ")
    time1.getTime()     

    while True:
        choice=int(input("-----Enter a choice: 1)Get Time 2)Previous Second 3)Next Second------>>>>>"))
        if not(choice>0 and choice<=3):
            break
        if choice==1:
            print("Current Time: ")
            time1.getTime()
        elif choice==2:
            time1.previousSecond()
            print("Previous Second Updated Time",end=" ")
            time1.getTime()     
        elif choice==3:
            time1.nextSecond()
            print("Next Second Updated Time",end=" ")
            time1.getTime()
        print()