package main
import "fmt"

func process(n []string, qLength int) {
    count := make([]int, qLength)
    q := make([]string, qLength)
    for i := 0; i < qLength; i++ {
        fmt.Scan(&q[i])
        for _, v := range n {
            if q[i] == v {
                count[i]++
            }
        }
        fmt.Println(count[i])
    }
}

func main() {
    var nLength, qLength int
    fmt.Scan(&nLength)
    n := make([]string, nLength)
    for i := 0; i < nLength; i++ {
        fmt.Scan(&n[i])
    }
    fmt.Scan(&qLength)
    process(n, qLength)
}
