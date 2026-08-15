package com.javapractice.recursiveTreeGraph;

public class GraphAdjacencyMatrix68_11 {
    /*
     * 인접 행렬: 2차원 배열을 사용하여 그래프의 연결 관계를 표현한다.
     *
     * 1. 무방향 그래프
     *    - 정점 a와 b가 연결되어 있으면 양방향을 모두 1로 설정한다.
     *    - graph[a][b] = 1
     *    - graph[b][a] = 1
     *
     * 2. 방향 그래프
     *    - 정점 a에서 b로 향하는 간선이 있으면 해당 위치를 1로 설정한다.
     *    - graph[a][b] = 1
     *
     * 3. 무방향 가중치 그래프
     *    - 정점 a와 b 사이 간선의 가중치가 c이면 양방향에 c를 저장한다.
     *    - graph[a][b] = c
     *    - graph[b][a] = c
     *
     * 4. 방향 가중치 그래프
     *    - 정점 a에서 b로 향하는 간선의 가중치가 c이면 해당 위치에 c를 저장한다.
     *    - graph[a][b] = c
     */
}
