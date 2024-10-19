export const metadata = {
  title: 'BookMatch',
  description: 'Book recommendation - BookMatch',
}

import '../style/globals.css'

export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {
  return (
    <html lang="pt-br">
      <head>
        <link rel="icon" href="https://img.icons8.com/?size=100&id=K64BmSGjcwqt&format=png&color=000000" />
        <link href="https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400..700;1,400..700&display=swap" rel="stylesheet"/>
        <link rel="stylesheet" href="/_next/static/css/app/layout.css?v=1729284656896" />
      </head>
      <body>{children}</body>
    </html>
  )
}
