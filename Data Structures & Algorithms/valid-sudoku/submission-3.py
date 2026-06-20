class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in range(9):
            seen = set()
            for col in range(9):
                if board[row][col].isnumeric() and board[row][col] in seen:
                    return False
                elif board[row][col].isnumeric():
                    seen.add(board[row][col])

        for col in range(9):
            seen = set()
            for row in range(9):
                if board[row][col].isnumeric() and board[row][col] in seen:
                    return False
                elif board[row][col].isnumeric():
                    seen.add(board[row][col])        
        
        for square in range(9):
            seen = set()
            for i in range(3):
                for j in range(3):
                    row = (square//3) * 3 + i
                    col = (square % 3) * 3 + j
                    if not board[row][col].isnumeric():
                        continue
                    if board[row][col] in seen:
                        return False
                    seen.add(board[row][col])

        return True