main :: IO ()
main = do
    putStr "Please enter your name: "
    name <- getLine
    putStrLn $ "Hello, " ++ name