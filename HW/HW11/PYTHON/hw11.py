def fill(image, sr, sc, color, cur):
        if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]): return;
        if cur != image[sr][sc]: return;
        image[sr][sc] = color;
        fill(image, sr-1, sc, color, cur);
        fill(image, sr+1, sc, color, cur);
        fill(image, sr, sc-1, color, cur);
        fill(image, sr, sc+1, color, cur);

def floodFill(image, sr, sc, color):

        if image[sr][sc] == color: return image;
        fill(image, sr, sc, color, image[sr][sc]);
        return image;

image = [[1,1,1],[1,1,0],[1,0,1]] 
sr = 1 
sc = 1 
color = 2

image = floodFill(image,sr,sc,color)
print(image)
