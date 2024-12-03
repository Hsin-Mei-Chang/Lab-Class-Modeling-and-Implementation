class Player:
    def __init__(self, name, position, number):
        # 初始化球員名稱、位置與球衣號碼
        self.name = name
        self.position = position
        self.number = number

class Team:
    def __init__(self, name):
        # 初始化球隊名稱並創建空的球員列表
        self.name = name
        self.players = []

    def add_player(self, player):
        # 將 Player 實例添加到球隊的球員列表中
        self.players.append(player)

    def get_player_info(self, number):
        # 查找球員並返回其詳細信息
        for player in self.players:
            if player.number == number:
                return f"{player.name} ({player.position}) - {player.number}"
        return "Player not found."

# 測試你的實現
player1 = Player("Chen Jie-Xian", "Outfielders", 24)
player2 = Player("Lin Yu-Min", "Pitchers", 45)
player3 = Player("Lin Chia-Cheng", "Catchers", 27)

# 創建一個球隊並添加球員
team1 = Team("Team Taiwan")
team1.add_player(player1)
team1.add_player(player2)

# 輸出查找結果
print(team1.get_player_info(24))  # 應該輸出 "Chen Jie-Xian (Outfielders) - 24"
print(team1.get_player_info(45))  # 應該輸出 "Lin Yu-Min (Pitchers) - 45"
print(team1.get_player_info(27))  # 應該輸出 "Player not found."
