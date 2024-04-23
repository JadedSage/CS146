
def minCostToSupplyWater(n: int, wells: list[int], pipes: list[list[int]]) -> int:
        def find(x: int) -> int:
            if p[x] != x:
                p[x] = find(p[x])
            return p[x]

        for i, w in enumerate(wells, 1):
            pipes.append([0, i, w])
        pipes.sort(key=lambda x: x[2])
        p = list(range(n + 1))
        ans = 0
        for a, b, c in pipes:
            pa, pb = find(a), find(b)
            if pa != pb:
                p[pa] = pb
                n -= 1
                ans += c
                if n == 0:
                    return ans
                
n = 2
wells = [1,1]
pipes = [[1,2,1],[1,2,2]]

print(minCostToSupplyWater(n,wells,pipes))
