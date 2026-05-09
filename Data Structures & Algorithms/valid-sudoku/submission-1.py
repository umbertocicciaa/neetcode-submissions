class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # check row
        for row in board:
            visited = set()
            for col in row:
                if col in visited:
                    return False
                if col != ".":
                    visited.add(col)
        # check colum
        for i in range(len(board)):
            visited = set()
            for j in range(len(board[i])):
                if board[j][i] in visited:
                    return False
                if board[j][i] != ".":
                    visited.add(board[j][i] )
        # check box
        for square in range(9):
            seen = set()
            for i in range(3):
                for j in range(3):
                    row = (square//3) * 3 + i
                    col = (square % 3) * 3 + j
                    if board[row][col] in seen:
                        return False
                    if board[row][col] != ".":
                        seen.add(board[row][col])        
        return True