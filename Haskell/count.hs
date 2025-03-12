main :: IO ()
main = do
    putStrLn "Counting from 1 to 10:"
    mapM_ print [1..10]