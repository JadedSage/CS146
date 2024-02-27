import heapq

def minMeetingRooms(intervals):
  endTimes = []
  totalServers = 0

  for start, end in intervals:
    while endTimes and endTimes[0] <= start:
      heapq.heappop(endTimes)
    heapq.heappush(endTimes, end)
    totalServers = max(totalServers, len(endTimes))

  return totalServers


intervals = [[5,10],[15,20],[0,30]] 
#intervals = [[0, 1], [1, 2], [2, 3]]
intervals = sorted(intervals, key=lambda x: x[0])
if(intervals[0][0]<0 or intervals[len(intervals)-1][0]>100000):
  print("Interval Time is invalid")
elif(len(intervals)<=1 or len(intervals)>= 1000000):
  print("Interval length is invalid")
else:
  print( minMeetingRooms(intervals))
  
#boggles my damn mind everytime I see how much smaller but more annoying python is for me because I had to look everythin up but once I know its so damn little in comparision 
