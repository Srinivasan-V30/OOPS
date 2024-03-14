
class Time:
    hour,minute,second=0,0,0
    def __init__(self,hour,minute,second):
        self.hour=hour
        self.minute=minute
        self.second=second
    def getHour(self):
        return self.hour
    def getMinute(self):
        return self.minute
    def getSecond(self):
        return self.second
    def setHour(self,hour):
        self.hour=hour
    def setMinute(self,minute):
        self.minute=minute
    def setSecond(self,second):
        self.second=second   
    def setTime(self,hour,minute,second):
        self.hour=hour
        self.minute=minute
        self.second=second     
    def getTime(self):
        print(f"{self.hour:02d}:{self.minute:02d}:{self.second:02d}")
    def nextSecond(self):
        if self.second==59:
            self.second=0
            if self.minute==59:
                self.minute=0
                if self.hour==23:
                    self.hour=0
                else:
                    self.hour+=1 
            else:
                self.minute+=1
        else:
            self.second+=1
    def previousSecond(self):
        if self.second==0:
            self.second=59
            if self.minute==0:
                self.minute=59
                if self.hour==0:
                    self.hour=23
                else:
                    self.hour-=1 
            else:
                self.minute-=1
        else:
            self.second-=1              
                        


        