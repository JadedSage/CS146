import heapq

def minMeetingRooms(intervals):
  end_times = []
  total_rooms = 0

  for start, end in intervals:
    while end_times and end_times[0] <= start:
      heapq.heappop(end_times)
    heapq.heappush(end_times, end)
    total_rooms = max(total_rooms, len(end_times))

  return total_rooms


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